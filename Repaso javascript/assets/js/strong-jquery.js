//todas las sentencias comienzan con el signo dolar $
$(document).ready(function(){
    let encendido = true
    // selectores- es la forma en como me conecto con un elemento del DOM
    // una clase
    // un ID
    // una eqtiqueta
    // name
    // combinacion de los anteriores


    // $('button').click(function(){     //etiqueta
    //     alert('hola')
    // })
    $('#alert').click(function(){     // un ID
        alert('soy el boton alert')
    })
    $('.btn-danger').click(function(){  // una clase
        alert('Soy el boton danger')
    })

    //funciones

    $('.btn-warning').click(function(){ 
        $('#text-bold').hide()           //oculta
    })

    $('.btn-success').click(function(){     
        $('#text-bold').show()           // muestra lo ocultado
    })

    $('#btn-toggle').click(function(){   // toggle es un solo boton que muestra y ocultas
        if (encendido === true) {
            $('#text-bold').hide() 
            encendido = false
        } else {
            $('#text-bold').show()
            encendido = true
        }
     })

     $('#btn-input').dblclick(function(){
        // let valor = $('#example').val()
        // alert(valor)
        $('#example').val('Hola a todos')

     })

     $('#btn-foods').click(function(){
        let arrayFoods = []
        $('input[name=food]:checked').each(function(){
            arrayFoods.push(this.value)
        })
        alert(arrayFoods)
     })
})