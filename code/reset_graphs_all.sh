
# resets the graphs

# current path
working_dir=$(pwd)
# prefix of `/code/` directory
current_dir=${working_dir%code*}

# echo prefix: $prefix


cp $current_dir/code/meteor_app/private/original_graphs/java.security.MessageDigest__digest_formatted.txt $current_dir/code/graphs/java.security.MessageDigest__digest_formatted.txt
cp $current_dir/code/meteor_app/private/original_graphs/java.security.MessageDigest__digest_vertmap.txt $current_dir/code/graphs
cp $current_dir/code/meteor_app/private/original_graphs/java.security.MessageDigest__digest_edgemap.txt $current_dir/code/graphs


cp $current_dir/code/meteor_app/private/original_graphs/javax.crypto.Cipher__init_formatted.txt $current_dir/code/graphs/javax.crypto.Cipher__init_formatted.txt
cp $current_dir/code/meteor_app/private/original_graphs/javax.crypto.Cipher__init_vertmap.txt $current_dir/code/graphs
cp $current_dir/code/meteor_app/private/original_graphs/javax.crypto.Cipher__init_edgemap.txt $current_dir/code/graphs



cp $current_dir/code/meteor_app/private/original_graphs/java.security.SecureRandom__next_formatted.txt $current_dir/code/graphs/java.security.SecureRandom__next_formatted.txt
cp $current_dir/code/meteor_app/private/original_graphs/java.security.SecureRandom__next_vertmap.txt $current_dir/code/graphs
cp $current_dir/code/meteor_app/private/original_graphs/java.security.SecureRandom__next_edgemap.txt $current_dir/code/graphs

