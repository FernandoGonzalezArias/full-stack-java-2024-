//manipulacion del DOM

function onClick() {

    let inputUno = document.getElementById("input-uno")
    let inputDos = document.getElementById("input-dos")
    let divResult = document.getElementById("resultado")
    let resultadoSuma = suma(inputUno.value, inputDos.value)

    divResult.innerHTML = resultadoSuma

}

function suma(a, b) {
    return parseInt(a) + parseInt(b)
}

function translateGenero() {
    let inputUno = document.getElementById("input-uno")
    let divResult = document.getElementById("resultado")
    divResult.innerHTML = convertirGenero(inputUno.value)
}

// sintaxis switch

function convertirGenero(genero) {
    switch (genero.toUpperCase()) {
        case 'F':
            return 'Femenino'
            break;
        case 'M':
            return 'Masculino'
            break;
        case 'N':
            return 'no binario'
            break;
        default:
            return 'Introduce F, M, N'
    }
}

// realice una funcion que traduzca la siguiente tabla
// 0 = Pagado
// 1 = Rechazado
// 3 = Pendiente de aprobacion
// validar que para otros casos, informar pago desconocido

function statusPago(pago) {

    switch (pago) {
        case '0':
            return 'Pagado'

        case '1':
            return 'Rechazado'

        case '3':
            return 'Pendiente de aprobacion'

        default:
            return 'Informar pago desconocido'
    }
}


function pagos() {
    let inputUno = document.getElementById("input-uno")
    let divResult = document.getElementById("resultado")
    divResult.innerHTML = statusPago(inputUno.value)
}

// ciclos
// for, until, while

// for, conocemos el incio y final del ciclo repetitivo

//variable control; condicion de cumplimiento; sentencia de incremento
for (let i = 1; i <= 100; i++) {
    console.log(i)
}

//recorrer los numero del 1 al 1000 he imprimir los numeros pares

for (let i = 1; i <= 1000; i++) {
    if (i % 2 == 0) {
        console.log(i)
    }
}

// Arreglos [0,1,2,3,4]

const arregloDiasSemana = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes', 'sabado', 'domingo']
console.log(arregloDiasSemana)
console.log(arregloDiasSemana[5])
for (let i = 0; i <= arregloDiasSemana.length - 1; i++) {
    const dia = arregloDiasSemana[i]
    console.log(dia)
}

//while 
console.log('comenzo el while')
let acabar = false
let contador = 0
while (acabar === false) {
    contador++
     console.log(contador)  
  if (contador === 10) {
    acabar = true
}
 }
console.log('termino el while')
console.log('------------------------------------------------------')
console.log('------------------------------------------------------')
console.log('------------------------------------------------------')
console.log('------------------------------------------------------')
console.log('------------------------------------------------------')
console.log('------------------------------------------------------')
console.log('inicio numeros impares de 1 a 100')

// Impares dentro del 1 al 100
for (let i = 1; i <= 100; i++) {
    if (i % 2  == 1) {
        console.log(i)
    }
}

var diaDeLaSemana = "carlos";

switch (diaDeLaSemana) {
  case "lunes":
    console.log("Hoy es lunes");
    break;
  case "martes":
    console.log("Hoy es martes");
    break;
  case "miércoles":
    console.log("Hoy es miércoles");
    break;
  case "jueves":
    console.log("Hoy es jueves");
    break;
  case "viernes":
    console.log("Hoy es viernes");
    break;
  default:
    console.log("No es un día de la semana válido");
}

let impares = 0;
while (impares <= 100) {
  if (impares % 2 !== 0) {
    console.log(impares);
  }
  impares++;
}
console.log('fin')