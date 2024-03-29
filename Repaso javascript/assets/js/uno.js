console.log("Hola este es mi primer console log")
console.log(340)

//variables, var - let - const

//es una constante y nunca va a varias 
const pi = 3.14

// let declara una variable
let firstName = "Nombre"
let lastName = "Apellido"

//var declara una variable, su sintaxis es igual
// a la de let, solo cambia let por var

var ciudadOrigen = "Santiago"
var paisOrigen = "Chile"

// console.log(firstName)
// console.log(lastName)
// console.log(ciudadOrigen)
// console.log(paisOrigen)

// ********************

// tipos de datos
//intiger, numero entero sin decimales
//float,con decimales hasta un numero determinado
//double, 
//date, fechas
//boolean, verdaderos o falsos
//string, texto cualquiera entre comillas simples

// *****************************

//operaciones matematicas

//declarar 2 variables, asignarles un numero a cada una 
//declarar una variable suma y asignarle el resultado de la suma de las 2 variables

let numero1 = 5
let numero2 = 5
let sumaN = numero1 + numero2
console.log(suma)

let resta1 = 5
let resta2 = 5
let resta = resta1 - resta2
console.log(resta)

let division1 = 10
let division2 = 2
let division = division1 / division2
console.log(division)

let multiplicacion1 = 5
let multiplicacion2 = 5
let multiplicacion = multiplicacion1 * multiplicacion2
console.log(multiplicacion)

let sumA = '1'
let sumB = 1
let sumaa = sumA + sumB
console.log(sumaa)

//************************************* 

// condicionales, sirve para la toma de deciciones (IF)

let edadVisitante = 16          // datos iniciales
if (edadVisitante >= 18) {      // si pasa eso
    console.log("puede pasar")  // escribe eso 
} else {                         // si no pasa   ...else significa no o lo contrario
    console.log("No puede pasar, es menor de edad") // escribe esto
}

// las condiciones se pueden enlazar con los operadores logicos
// && (and), || (or)

let edadHombre = 80
let genre = 'M'
if (edadHombre >= 60 && genre === 'M') {
    console.log('eres un hombre viejo ')
}

// //if else if

//  if(condicion1){              // si pasa eso 
//                              // haz esto
//  }else if(condicion2){      // si no pasa pero pasa lo siguiente
//                            // haz esto
//  }

// //----------------------------------------------------------------

let num = 15
if (num <=10) {
console.log(" unidad")
} else if (num <= 99) {
console.log(" decena")
} else if (num >99 && num <=999) {
console.log(" centena")
}

//funciones

function suma (numeroa, numerob){
    let resultado = numeroa + numerob
    return resultado
}

let resultadoSuma = suma(2, 6)
console.log(resultadoSuma)

let resultadoSuma2 = suma(2, 16)
console.log(resultadoSuma2)

let resultadoSuma3 = suma(11515165, 65151153)
console.log(resultadoSuma3)
//-------------------------------------------------------------

function fabrica(componente1, componente2, componente3){
    return componente1 + componente2 + componente3
}

let bolsadejabon = fabrica("ja", "bon", " de barra") 
console.log(bolsadejabon)
//-------------------------------------------------------------

//define una funcion que calcule el area de un rectangulo
//he implementela con un rectangulo con base = 5 y altura = 10

function area(base, altura){
    return base * altura
}

let areaRectangulo = area(5, 10)
console.log(areaRectangulo)
//----------------------------------------------------------------

//defina una funcion que reciba la edad pasada a traves de una variable 
// y determine si la persona es mayor de edad o no

edad = 50
function persona(edad ){
    if(edad >=18){
      console.log("es mayor de edad")
    }else{
      console.log("es menor de edad")
    }
  }

let edadPersona = persona(edad)
console.log(edadPersona)
//------------------------------------

console.log("esto se imprime")

console.log("9")
console.log(parseInt("9"))  // parseInt transforma string a numero

let valorFlotante = parseFloat("9.258") // parseFloat transforma string a numero con decimal
console.log(valorFlotante)