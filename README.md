groovy-quine
============
A repository for my playing with writing [quines](http://en.wikipedia.org/wiki/Quine_(computing)) in Groovy.

It includes some quines which I wrote and some shell scripts for testing quines and using my counting quine.

I wrote some accompanying blog posts, "[Quines](http://dnahodil.wordpress.com/2014/08/04/quines/)" and "[A More Complex Quine](http://dnahodil.wordpress.com/2014/08/23/a-more-complex-quine/)".

## The shell scripts
There are a few scripts in this repository. Their usage is described below.

### test-quine.sh
Used to test whether a given Groovy script is a quine. Example usage:

`> ./test-quine.sh quine-2.groovy`

To accurately test quine-3.groovy (the counting quine) you need to pass arguments along with the script. This is because it changes state as it is used so the output is not exactly the same as the input.

To test it as it comes from the repo you can use the script like this: `> ./test-quine.sh quine-3.groovy 0`

If, by using the run_counting_quine.sh and reset_counting_quine.sh scripts, you had the quine at 240 counting in octal then you could test it with this command: `> ./test-quine.sh quine-3.groovy 240 o`.

### run_counting_quine.sh
Used to run my counting quine (quine-3.groovy) one or more times. Example usage:

Run the quine once: `> ./run_counting_quine.sh`

Run the quine 100 times: `> ./run_counting_quine.sh 100`

### reset_counting_quine.sh
Used to reset the counting quine and to optionally change the base of the numbering system. Example usage:

Reset back to 0 in the current numbering system: `> ./reset_counting_quine.sh`

Reset back to 0 and change to binary counting:  `> ./reset_counting_quine.sh b`
