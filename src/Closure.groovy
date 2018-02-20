def myClosure = {
    println "In a closure"
    println new Date()
}


myClosure()

for (i in 1..3) {
    myClosure()
    sleep(1000)
}

(1..10).findAll({ it%2 == 0}).each({i ->
    println "In each block $i"
})