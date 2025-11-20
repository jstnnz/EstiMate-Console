# PowerShell script to compile and run the Java Console Architecture Estimator

Write-Host "Compiling Java source files..."
javac -d bin src/*.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation successful. Running the estimator..."
    java -cp bin src.EstimatorApp
} else {
    Write-Host "Compilation failed. Please check for errors."
}
