FROM meteor/meteor-base:20211013T200759Z_489f5fe


# Install Meteor
RUN curl https://install.meteor.com/ | sh

# Create a directory for your Meteor app
WORKDIR /app

# Expose any necessary ports (e.g., Meteor runs on port 3000 by default)
EXPOSE 3000

# Start your Meteor app (adjust this command based on your app's setup)
CMD STARTING_COUNT=1 meteor