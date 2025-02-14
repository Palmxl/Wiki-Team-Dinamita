/*=============== EMAIL JS ===============*/
const contactForm = document.getElementById('contact-form'),
contactMessage = document.getElementById('contact-message')

const sendEmail = (e) => {
  e.preventDefault()
  
  // serviceID - templetaID - #form - publickKey

  emailjs.sendForm('service_u4fv0on', 'template_7tvajdd', '#contact-form', 'vuJXAOpNxn8kVtrUj')

  .then(() => {
    //Mensaje enviado
    contactMessage.textContent = 'Mensaje enviado correctamente ✅'

    //Borrar mensaje 5 segundos despues
    setTimeout(() => {
      contactMessage.textContent = ''
    }, 5000)

    contactForm.reset()
}, () => {
    //Mensaje de error
    contactMessage.textContent = 'Error al enviar el mensaje ❌'
    })
}
contactForm.addEventListener('submit', sendEmail)

/*=============== SHOW SCROLL UP ===============*/ 


/*=============== SCROLL SECTIONS ACTIVE LINK ===============*/


/*=============== SCROLL REVEAL ANIMATION ===============*/
