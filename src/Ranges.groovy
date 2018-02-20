def numbers = 1..10

for (num in numbers) {
    println num
}


def range = 'a'..'g'

for (var in range) {
    println var
}

def  enum DAYS {
    MON,
    TUE,
    WED,
    THUR,
    FRI
}

def weekdays = DAYS.MON..DAYS.FRI

for (day in weekdays) {
    println day
}


println "Extents: "

println weekdays.from
println weekdays.to

