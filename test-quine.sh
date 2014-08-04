#!/bin/bash

clear

if [ -f "$1" ]
then
    echo "Checking $1..."

    [ "$(groovy $1 | diff $1 -)" ] && echo "$1 is not a valid quine (see output)" || echo "$1 is a valid quine!"

    echo "=========================================================="

    groovy $1 | diff $1 - --side-by-side # For display

    echo "=========================================================="
else
    echo "File '$1' not found"
fi