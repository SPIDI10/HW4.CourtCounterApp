import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class ScoreViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    // Keys for saving state
    private val SCORE_TEAM_A_KEY = "scoreTeamA"
    private val SCORE_TEAM_B_KEY = "scoreTeamB"

    // Initialize scores using savedStateHandle
    var scoreTeamA: Int = savedStateHandle.get(SCORE_TEAM_A_KEY) ?: 0
    var scoreTeamB: Int = savedStateHandle.get(SCORE_TEAM_B_KEY) ?: 0

    // Update scores and save them
    fun updateScoreTeamA(score: Int) {
        scoreTeamA += score
        savedStateHandle.set(SCORE_TEAM_A_KEY, scoreTeamA)
    }

    fun updateScoreTeamB(score: Int) {
        scoreTeamB += score
        savedStateHandle.set(SCORE_TEAM_B_KEY, scoreTeamB)
    }
}
