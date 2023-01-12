const Card = require('../models/Card');



exports.create =  async (req, res) =>{
    try{

    const cards = new Card({ front: req.body.front, back: req.body.back, userId:req.body.userId});
    await cards.save();
    res.redirect('/?message=card saved')

    } catch (e) {
            return res.status(400).send({
                message: JSON.parse(e),
            });
        }
    
}