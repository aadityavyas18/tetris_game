package ds.tetris.di

import org.koin.core.context.startKoin
//The koin works on simple DSL model
//all the dependent objects are there
fun initKoin(){
    startKoin {
        modules(gameModule, platformModule)
    }
}
