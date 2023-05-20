package com.main.real.data.service.event.stream.integration.dto

enum class CardStatusEnum(val id:Int, val label:String) {
    BLOCKED(1,"BLOCKED"),
    UNLOCKED(2,"UNLOCKED"),
    CANCELD(3,"CANCELED");

    companion object {

        fun of(label:String): CardStatusEnum? = values().filter {
            it.label.equals(label)
        }.firstOrNull()

        fun of(id:Int): CardStatusEnum? = values().filter {
            it.id.compareTo(id)==0
        }.firstOrNull()
    }

}