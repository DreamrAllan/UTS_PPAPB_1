    package com.example.uts_1

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import com.example.uts_1.databinding.ActivityProfileBinding

    class Activity1 : AppCompatActivity() {

        private lateinit var binding: ActivityProfileBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityProfileBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Get the name passed from Activity2
            val userName = intent.getStringExtra("name")
            binding.nama.text = userName

            binding.keluar.setOnClickListener {
                Toast.makeText(this, "You have successfully logged out", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
