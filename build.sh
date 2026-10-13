#!/bin/sh
set -e
cd "$(dirname "$0")"
rm -rf out && mkdir -p out
javac -encoding UTF-8 -d out $(find src/main/java -name '*.java')
cp -r src/main/resources/. out/
printf 'Main-Class: bouncetales.Main\n' > manifest.txt
jar cfm BounceTales.jar manifest.txt -C out .
rm -f manifest.txt
echo "Built BounceTales.jar (run: java -jar BounceTales.jar)"
