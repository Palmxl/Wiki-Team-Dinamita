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
const scrollUp = () => {
  const scrollUp = document.getElementById('scroll-up');

  this.scrollY >= 350 ? scrollUp.classList.add('show-scroll') 
  : scrollUp.classList.remove('show-scroll')
}
window.addEventListener('scroll', scrollUp)
/*=============== SCROLL SECTIONS ACTIVE LINK ===============*/
const sections = document.querySelectorAll('section[id]')

const scrollActive = () => {
  const scrolldown = window.scrollY

  sections.forEach(current => {
    const sectionHeight = current.offsetHeight,
    sectionTop = current.offsetTop - 58,
    sectionId = current.getAttribute('id'),
    sectionClass = document.querySelector('.nav__list a[href*=' + sectionId + ']')

    if(scrolldown > sectionTop && scrolldown <= sectionTop + sectionHeight){
      sectionClass.classList.add('active-link')
    } else {
      sectionClass.classList.remove('active-link')
    }
  })
}
window.addEventListener('scroll', scrollActive)

/*=============== SCROLL REVEAL ANIMATION ===============*/
const sr = ScrollReveal({
  origin: 'top',
  distance: '60px',
  duration: 2500,
  delay: 400,
  //reset: true
})

sr.reveal(`.perfil`)
sr.reveal(`.info`, {origin: 'left', delay: 800})
sr.reveal(`.skills`, {origin: 'left', delay: 1000})
sr.reveal(`.about`, {origin: 'rigth', delay: 1200})
sr.reveal(`.projects__card, .services__card, .experience__card`, {interval: 100})