let newDateFunction = new Date()
function randerDate(){
    newDateFunction.setDate(1)
    let day = newDateFunction.getDay()

    let currentDate = new Date(
        newDateFunction.getFullYear(),
        newDateFunction.getMonth() + 1,0
    ).getDate() // to get the last date of current month


    let prevDate = new Date(
        newDateFunction.getFullYear(),
        newDateFunction.getMonth(), 0
    ).getDate() // to get the last date of previous month

    let addNextDate = new Date(
        newDateFunction.getFullYear(),
        newDateFunction.getMonth() + 1,0
    ).getDate()

    console.log(currentDate, prevDate, addNextDate);

    let addNext = addNextDate + 7

    let month = newDateFunction.getMonth()
    let year = newDateFunction.getFullYear()
    let monthArr = ['JANEIRO', 'FEVEREIRO', 'MARÇO', 'ABRIL', 'MAIO', 'JUNHO', 'JULHO', 'AGOSTO', 'SETEMBRO',
		 'OUTUBRO', 'NOVEMBRO', 'DEZEMBRO']
    document.getElementById("month").innerHTML = monthArr[month] + " - " + year

    let today = new Date()
    let weekDay = today.getDay()
    document.getElementById("date").innerHTML = today.toDateString()
    document.querySelector(`.week :nth-child(${weekDay + 1})`).classList.add("active")
 


    let DATES = ""

    for(let x = day; x > 0; x--){
        DATES += "<div class='prev'>" + (prevDate - x + 1) + "</div>"
    }

    for(let i = 1; i <= currentDate; i++){
        if(i === today.getDate() && newDateFunction.getMonth() == today.getMonth() && newDateFunction.getFullYear() === today.getFullYear()){
            DATES += "<div class='today'>" + i + "</div>"
        }
        else{
            DATES += "<div>" + i + "</div>"
        }
    }

    for(let k = 1; k <= addNext; k++){
        DATES += "<div class='next'>" + k + "</div>"
    }

    document.querySelector('.dates').innerHTML = DATES
}

function moveDate(para){

    if(para == 'prev'){
        newDateFunction.setMonth(newDateFunction.getMonth() - 1)
    }
    
    else if(para == 'next'){
        newDateFunction.setMonth(newDateFunction.getMonth() + 1)
    }

    randerDate()
}


function teste(){
	alert("Funcionou")
}