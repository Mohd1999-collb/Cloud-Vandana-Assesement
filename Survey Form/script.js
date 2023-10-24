const fName = document.getElementById('fname');
const lName = document.getElementById('lname');
const dob = document.getElementById('dob');
const email = document.getElementById('email');
const prof = document.getElementById('prof');
const number = document.getElementById('number');
// country
const option = document.getElementsByTagName('option');

// gender
const male = document.getElementById('male');
const female = document.getElementById('female');
const other = document.getElementById('other');

//
const yes = document.getElementById('yes');
const no = document.getElementById('no');

const clg1 = document.getElementById('clg-sugg-1');
const clg2 = document.getElementById('clg-sugg-2');

const satisfied = document.getElementById('satisfied');
const undecided = document.getElementById('undecided');
const unsatisfied = document.getElementById('unsatisfied');
const textArea = document.getElementById('textAria');

// Butoon
const submit = document.getElementById('b');
const reset = document.getElementById('btn2');
const form = document.getElementsByTagName('form')[0];
const container = document.getElementsByClassName('conatiner')[0];

submit.addEventListener('click', (e) => {
    e.preventDefault();
    valid();
});


function valid(){
    if(fName.value != "" || lName.value != "" || dob.value != "" || email.value != "" || prof.value != "" || number.value != ""){
        alert(
                    `     
                 First name : ${fName.value}
                 Last name : ${lName.value}
                 Date of Birth : ${dob.value}
                 Email : ${email.value}
                 Profession : ${prof.value}
                 Mobile number : ${number.value}
                 Country : "India"
                 Gender : "Male"
                 Is this first time you are using our products & service? : "Yes"
                 Would you suggestion to your friends and colleague? : "Yes"
                 How satisfied are you with our compony overall? : "Satisfied"
                 Do you have suggestion to improve our service? : ${textArea.value}     
                 `,
        )
        location.reload();
    }
}

