package cClassesAndObjetos

// ================ SECONDARY CONSTRUCTOR
// A class can also declare secondary constructors, which are prefixed with the word 'constructor'

// The most common use of the secondary constructor comes when you need to extend a class that
// provides SEVERAL constructors.

// which constructor will be called?
// It's decided by the compiler based on the arguments received.
class EmployeeCompany {

    constructor (emp_id : Int, emp_name: String ) {
        var id: Int = emp_id
        var name: String = emp_name
        println("primeiro construtor:")
        print("Employee id is: $id, ")
        println("Employee name: $name")
    }

    constructor (emp_id : Int, emp_name: String, emp_salary : Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        println("segundo construtor:")
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee salary: $salary")
    }
}


// A secondary constructor may call another secondary constructor
// of the same class using this() function.
class Add {

    // calling another secondary using 'this'
    constructor(a: Int,b:Int) : this(a,b,7) {
        var sumOfTwo = a + b
        println("The sum of two numbers 5 and 6 is: $sumOfTwo")
    }

    // this executes first
    constructor(a: Int, b: Int,c: Int) {
        var sumOfThree = a + b + c
        println("The sum of three numbers 5,6 and 7 is: $sumOfThree")
    }
}


// ==================================================================================================
fun main() {

    // calling first constructor
    EmployeeCompany(18018, "Joaozinho")
    println()

    // calling second constructor
    EmployeeCompany(11011,"Mariazinha",600000.5)
    println()

    println("--------------")

    Add(5,6)
    println()


}