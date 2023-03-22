SBA has recently launched a mobile banking app, which is a big focus for them moving forward.

There are two main areas of focus you’ll be working on within the app:

Authentication.
Data management.
This first task involves authentication. You will be reporting to the security lead of the software engineering team. The security lead has sent instructions on a JSON web token (JWT) authentication system they’d like you to design and build for the mobile application. Here is the email from the security lead:

Good afternoon,

Great to have you as part of the team! We’re excited to see your work and for you to be involved in some exciting projects.

Your first task is to build a JWT-based authentication application in Java. You must build the app using the Spring Boot framework. Include Spring Web and Spring Security as dependencies.

When running the application, it should expose a single endpoint mapped to “/authenticate”. Specification for this endpoint is as follows:

Create a single REST HTTP POST API.
Request body should include a username and password.
Response should include an authentication token.
For now, you do not need to create a database to store usernames and hashed passwords. Instead, you can simply hardcode the values of a user and their hashed password into a file that should be read when the endpoint authenticates data from the request body.

When finished with development, please send me all your files compressed into a folder for the team to conduct a code review.

Best regards

Authentication is a massive topic for SBA and their mobile banking app. With such sensitive and personal information being available within the application, it is important to ensure that we implement and follow security best practices throughout the mobile banking app.
