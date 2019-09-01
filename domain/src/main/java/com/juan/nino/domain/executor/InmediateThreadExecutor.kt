package com.juan.nino.domain.executor

/**
 * @author Juan Sebastian Niño
 */
class InmediateThreadExecutor : ThreadExecutor {
    override fun execute(runnable: Runnable?) {
        runnable?.run()
    }
}