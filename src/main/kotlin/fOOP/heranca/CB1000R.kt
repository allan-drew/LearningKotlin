package fOOP.heranca

class CB1000R : Moto(velocidadeMaxima = 250), MotoEsportiva {

    override var turbo: Boolean = false // inicia com false por padrão
        get() = field
        set(value) { field = value }

    override fun acelerar() {
        super.alterarVelocidade(if(turbo) 50 else 25) // a CB1000R irá acelerar de 50 em 50 se o turbo estiver ligado
                                                        // e de 25 em 25 se o turbo estiver desligado.
    }

    override fun frear() {
        super.alterarVelocidade(-25)
    }

}

