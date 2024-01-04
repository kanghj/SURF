FROM meteor/meteor-base:20211013T200759Z_489f5fe


USER root

RUN apt-get update && apt-get install -y git


WORKDIR /usr/src/app/
RUN git clone https://github.com/kanghj/SURF.git

WORKDIR SURF/code/meteor_app
RUN chmod -R 755 .meteor
RUN chown -Rh mt .meteor
RUN mkdir .meteor/local
RUN chown -Rh mt .meteor/local
RUN meteor npm install --save pycollections html2canvas bootstrap highlight.js @babel/runtime openai   

USER mt



# Expose any necessary ports (e.g., Meteor runs on port 3000 by default)
EXPOSE 3000

# Start your Meteor app (adjust this command based on your app's setup)
CMD STARTING_COUNT=1 meteor