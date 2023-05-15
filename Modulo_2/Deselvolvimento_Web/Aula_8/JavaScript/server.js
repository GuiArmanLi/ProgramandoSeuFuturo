const expres = require('espress')
const app = express()
const port = 8050

let bancoDeDadosProdutos = []

app.get('/produtos', (req, res) => {
    return res.status(200).json(bancoDeDadosProdutos)
})

app.post('/adicionarProduto', (req, res) => {
    res.status(200).json("Teste")
})

app.listen(port, () => {
    console.log(`Testando servidor http://localhost:${port}`)
})