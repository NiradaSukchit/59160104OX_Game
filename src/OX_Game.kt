import kotlin.system.exitProcess

val table = arrayOf(
    arrayOf(' ', '1', '2', '3'),
    arrayOf('1', '-', '-', '-'),
    arrayOf('2', '-', '-', '-'),
    arrayOf('3', '-', '-', '-')
)
var turn = 'O'
var row = 0
var col = 0
var count = 0

fun input(){
    count +=  1
    while (true){
        try {
            print("Please input Row Col: ")
            val input = readLine()

            val rcList1 = input?.split(" ")
            if (rcList1?.size != 2 ){
                println("Error: Must input 2 numbers Row Col (EX: 1 2) ")
//                printTable()
                continue
            }
            row = rcList1[0].toInt()
            col = rcList1[1].toInt()

            if (table[row][col]== 'X'||table[row][col]=='O'){
                println("Error: Duplicate Position, Try again")
//                printTable()
                continue
            }
            if (row == 0 || col == 0 || row > 3 || col > 3){
                println("Error: Number Must be 1-3, Try again")
//                printTable()
                continue
            }
            break

        }catch (e: Throwable){
            println(" Error: ${e.message}, Incorrect format ( EX: 1 2)")
//            printTable()
        }
    }
}
fun printTable(){

    for (Row in table){
        for (Col in Row){
            print("$Col ")
        }
        println()
    }
}

fun changeTurn(){
    if (turn == 'X'){
        turn = 'O'
    }else{
        turn = 'X'
    }
    println("$turn Turn")
}

fun updateTable() {

    if (turn == 'X'){
        table[row][col] = 'X'
    }else{
        table[row][col] = 'O'
    }
}

fun checkWinner(){
    if (table[1][1]=='X'&&table[2][2]=='X'&&table[3][3]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[1][3]=='X'&&table[2][2]=='X'&&table[3][1]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[1][1]=='X'&&table[2][1]=='X'&&table[3][1]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[1][2]=='X'&&table[2][2]=='X'&&table[3][2]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[1][3]=='X'&&table[2][3]=='X'&&table[3][3]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[1][1]=='X'&&table[1][2]=='X'&&table[1][3]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[2][1]=='X'&&table[2][2]=='X'&&table[2][3]=='X'){
        println("X Win!")
        exitProcess(0)
    }
    else if (table[3][1]=='X'&&table[3][2]=='X'&&table[3][3]=='X'){
        println("X Win!")
        exitProcess(0)
    }

    else if (table[1][1]=='O'&&table[2][2]=='O'&&table[3][3]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[1][3]=='O'&&table[2][2]=='O'&&table[3][1]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[1][1]=='O'&&table[2][1]=='O'&&table[3][1]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[1][2]=='O'&&table[2][2]=='O'&&table[3][2]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[1][3]=='O'&&table[2][3]=='O'&&table[3][3]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[1][1]=='O'&&table[1][2]=='O'&&table[1][3]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[2][1]=='O'&&table[2][2]=='O'&&table[2][3]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if (table[3][1]=='O'&&table[3][2]=='O'&&table[3][3]=='O'){
        println("O Win!")
        exitProcess(0)
    }
    else if(count == 9){
        println("Draw!")
        exitProcess(0)
    }
}
fun main() {
    while (true){
        printTable()
        checkWinner()
        changeTurn()
        input()
        updateTable()
    }
}