
package io.github.smart.cloud.utility.security;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import io.github.smart.cloud.utility.constant.SecurityConst;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/**
 * AES对称加密工具类
 *
 * @author collin
 * @date 2019-06-24
 */
public class AesUtil {

    private static String aes(String content, String password, int type) {
        try {
            KeyGenerator generator = KeyGenerator.getInstance(SecurityConst.ENCRYPTION_ALGORITHM);
            SecureRandom random = SecureRandom.getInstance(SecurityConst.RNG_ALGORITHM);
            random.setSeed(password.getBytes(StandardCharsets.UTF_8));
            generator.init(128, random);
            SecretKey secretKey = generator.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, SecurityConst.ENCRYPTION_ALGORITHM);
            Cipher cipher = Cipher.getInstance(SecurityConst.ENCRYPTION_ALGORITHM);
            cipher.init(type, key);
            if (type == Cipher.ENCRYPT_MODE) {
                byte[] byteContent = content.getBytes(StandardCharsets.UTF_8.name());
                return ByteUtils.toHexString(cipher.doFinal(byteContent));
            } else {
                byte[] byteContent = ByteUtils.fromHexString(content);
                return new String(cipher.doFinal(byteContent), StandardCharsets.UTF_8);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }

}