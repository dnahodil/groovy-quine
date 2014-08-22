#!/bin/bash

QUINE="quine-3.groovy"

function exec {
	local OUTPUT=$(groovy $QUINE)
	echo "${OUTPUT}" 1>$QUINE
}

for i in `seq 1 ${1:-1}`;
do
	exec
	printf "."
done

cat $QUINE
