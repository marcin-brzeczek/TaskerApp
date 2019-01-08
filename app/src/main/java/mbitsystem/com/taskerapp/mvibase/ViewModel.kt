package mbitsystem.com.taskerapp.mvibase

import io.reactivex.Observable


interface ViewModel {

    fun processIntents(intent: Observable<Intent>)

    fun state(): Observable<ViewState>
}