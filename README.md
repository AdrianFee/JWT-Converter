# JWT Decoder

**Description:** The JWT Decoder is a simple web application that allows you to decode the payload of JSON Web Tokens (JWTs). This tool is designed to help you view the contents of JWTs quickly and easily, especially when you need to inspect the data within them.

## Features

- Decodes the payload of JWTs
- Supports JWTs with unsigned payloads
- Provides a user-friendly web interface
- Allows you to copy the decoded payload for further use

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/AdrianFee/JWT-Converter.git
cd JWT-Converter
```
### Build and run
```bash
./mvnw spring-boot:run
```
The application will start on port 8081 by default.
Access it in your web browser at http://localhost:8081.

## Usage
1. Enter a JWT in the input field on the web page. 
2. Click the "Decode" button. 
3. The decoded payload will be displayed below. 
4. To copy the decoded payload, click the "Copy" button next to it.

## Shutdown
- Shut down your terminal window, and the application will shut down.

