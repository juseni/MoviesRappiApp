package com.juan.nino.domain.executor

import io.reactivex.Scheduler

/**
 * @author Juan Sebastian Niño
 */
interface PostExecutionThread {
    val scheduler: Scheduler
}