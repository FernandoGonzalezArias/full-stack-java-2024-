$(document).ready(function(){
    //ambito de las variables 
    // 1- ambito global
    // 2 - ambito global

    var numero = 1                 //global, las variables que estan fuera  
                                   //son globales y pueden ser usadas x locales

    $('#uno').click(function(){    //todo eso es local 
        alert(numero)              //todo eso es local
    })                             //todo eso es local

    $('#dos').click(function(){    //todo eso es local
        const numero = 3           //todo eso es local
        alert(numero)              //todo eso es local
    })

    // entre locales no se conectan las variables
    // los locales solo pueden buscar variables fuera de ellas en globales

     $('#get-posts').click(function(){
        // fetch es una funcion de js que sirve para consumir apis
        // la url de la api
        // promese = promise, sincrono y/o asincrono
        
        const url = 'https://jsonplaceholder.typicode.com/todos/'
        fetch(url)
           .then(response => response.json())
           .then((json) => {
                  console.log('***', json)
                  console.log(typeof json)
                  console.log(json.length)
                  console.log(json[0])
                  console.log(json[0].title)
                  const carro = {
                    placa: 'jkkr42',
                    modelo: 'MG'
                  }
                console.log(carro.placa)
                for (let index = 0; index < 10; index++) {
                    const todo = json[index];
                    console.log(todo)
                }
                const todosCompleted = json.filter((todo) => todo.completed === false) // filtra doto lo q uno busca
                console.log(todosCompleted.length)
                const todo10 = json.find((todo) => todo.id === 5)  // la funcion find solo busca 1 informacion
                console.log(todo10)
                if(!todo10) {
                    console.log('el todo buscado no existe')
                }
        
           })
            // el .then es una funcion, necesita un parametro
           // y ese parametro iene otra funcion 
           // y esa funcion se le conoce como callback
           $('#get-post').click(function(){
            const url='https://jsonplaceholder.typicode.com/posts/8'
            fetch(url)
                .then(response => response.json())
                .then(json => {
                    console.log({json})
                    console.log({body: json.body})
                })
           })


            $('#create-post').click(function(){
                const url = 'https://jsonplaceholder.typicode.com/posts'
                fetch(url, {
                    method: 'POST',
                    body: JSON.stringify({
                        title: 'como programar en js',
                        body: ' tienes que hacer un bootcamp',
                        usuario: 1,
                    }),
                    headers:{
                        'content-type': 'application/json; charset=UTF-8',
                    },
                })
                .then((response) => response.json())
                .then((json) =>{ 
                 console.log(json)
                });
            })
        })

        $('#get-users').click(function(){
            const url = 'https://jsonplaceholder.typicode.com/users'
            fetch(url)
                .then(response => response.json())
                .then(users => {
                    console.log({users})
                    const list = $('#userList')
                    let userList = ''
                    for (let index = 0; index < users.length; index++) {
                        const user = users[index];
                        userList = userList + `<li>${user.name}, ${user.email}, ${user.username}</li>`
                        
                    }
                    list.append(userList)
                })
        })




})