// A Groovy Quine

def startLines = 0..7
def endLines = -6..-1
def quot = 39 as char
def newLine = 10 as char
def slash = 92 as char

def source = '''\
// A Groovy Quine

def startLines = 0..7
def endLines = -6..-1
def quot = 39 as char
def newLine = 10 as char
def slash = 92 as char

def lines = source.readLines()
lines[startLines].each{ println it }
println "def source = $quot$quot$quot$slash"
print source
println "$quot$quot$quot$newLine"
lines[endLines].each{ println it }
'''

def lines = source.readLines()
lines[startLines].each{ println it }
println "def source = $quot$quot$quot$slash"
print source
println "$quot$quot$quot$newLine"
lines[endLines].each{ println it }