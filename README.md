## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: dk.fitfit.BookRequestHandler

## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)

```bash
./gradlew shadowJar
aws s3 cp build/libs/lambda-1.0.0-all.jar s3://sketch-lambda/mn/v1.0.0/lambda-1.0.0-all.jar
```
