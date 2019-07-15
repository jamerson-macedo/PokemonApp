package com.jmdevelopers.pokemonapp.model

class Pokemon {
    var id:Int=0
    var num: String? =null
    var name: String? =null
    var img: String? =null
    var type: List<String>? =null
    var weight: String? =null
    var candy: String? =null
    var candy_count: Int =0
    var spawn_chance:Double=0.toDouble()
    var avg_spawns:Double=0.toDouble()
    var spawn_time:List<String>?=null
    var multipliers:List<Double>?=null
    var weaknesses:List<String>?=null
    var next_evolution:List<Evolution>?=null
    var prev_evolution:List<Evolution>?=null


}
