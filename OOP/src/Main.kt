fun main() {
    val loginButton = Button(
        "Login",
        1232,
        object : OnClickListener {
            override fun onClick() {
                // Log in the user.
            }

        }
    )
    val signUpButton = Button(
        "Sign Up",
        23423,
        object : OnClickListener {
            override fun onClick() {
                // Sign up the user.
            }
        }
    )
}

class Button(
    val text: String,
    val id: Int,
    onClickListener: OnClickListener
)

class ClickListener(): OnClickListener {
    override fun onClick() {

    }

}

interface OnClickListener {
    fun onClick()
}