 
var res = document.getElementById('res')
$('#calc').submit(function (event) {
    event.preventDefault();

    var fsex = document.getElementsByName('radsex')
    var sex = 0
    if (fsex[1].checked) {
        sex = 1
    }

    var dadosImc = {
        peso:   Number($('#peso').val()),
        altura: Number($('#altura').val()),
        sexo: sex
    };
    fetch('http://localhost:8080/api/imc/calcular', {method: "POST",
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(dadosImc)}).then(response => response.text()).then(json => res.innerHTML = json)




});

