#!/bin/bash

QUINE="quine-3.groovy"

OUTPUT=$(groovy $QUINE 0 "${1:-d}")
echo "${OUTPUT}" 1>$QUINE

cat $QUINE
