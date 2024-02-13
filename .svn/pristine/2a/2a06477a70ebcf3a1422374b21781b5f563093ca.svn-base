#!/bin/sh
#
# Converte o encondig 
cd ../paradigmabs/br/gov/sp/saobernardo/paradigma/ws/wbtdepara/
mv ./EnumTipoDocumento.java enum_tipo_old.java
iconv -t UTF-8 -f ISO-8859-1 ./enum_tipo_old.java  > ./EnumTipoDocumento.java
rm -rf ./enum_tipo_old.java

