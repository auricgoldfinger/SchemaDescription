# Generate sample openapi files
This repository is created to showcase [a missing feature in swagger-core](https://github.com/swagger-api/swagger-core/issues/3900)
where the description of custom typed fields do not appear in the yaml description, even though the openapi 3.1 spec is used.

## Prerequisites
* Install [NodeJS](https://nodejs.org/en/download)
* Install [Maven](https://maven.apache.org/download.cgi)
* Install [Java JDK](https://adoptium.net/en-GB/)
* then run `npm init` in the workspace.

## Run
To build and upload a new version of the openapi yaml files,
you just have to `npm run build`