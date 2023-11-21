package com.example.youtube.di

import com.example.youtube.repositories.Repository
import org.koin.dsl.module

val repoModules = module {
    single { Repository(get()) }
}