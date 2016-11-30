#!/usr/bin/env bash

SCRIPT_BASE_NAME=`basename "$0"`

cd `dirname $0`

find src/ -name *.java -exec rm -f {} \;
swagger-codegen generate -l java -i swagger.json -c config-swagger

git apply patchs/*.patch
