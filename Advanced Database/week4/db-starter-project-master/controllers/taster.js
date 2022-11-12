const Taster = require("../models/Taster");

exports.list = async (req, res) => {
  try {
    const tasters = await Taster.find({});
    res.render("tasters", { tasters: tasters }); // this could pass on several properties 
                                    // e.g. { tasters: tasters, title: "wine taster", taterCount: 10 }
                                    //Each on of these properties is assigned to a variable and made available to us in our view. For instance, enter the following into your tasters.ejs
  } catch (e) {
    res.status(404).send({ message: "could not list tasters" });
  }
};

exports.delete = async (req, res) => {
  const id = req.params.id;
  try {
    await Taster.findByIdAndRemove(id);
    res.redirect("/tasters");
  } catch (e) {
    res.status(404).send({
      message: `could not delete  record ${id}.`,
    });
  }
};