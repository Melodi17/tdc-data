# as at command block

function tdcdata-test:scoreboard/operation/before_each

scoreboard players set URShiftNegativePlayer TestObjective -100

scoreboard players operation URShiftNegativePlayer TestObjective >>>= #2 TestConsts

execute if score URShiftNegativePlayer TestObjective matches 1073741799 run setblock ~ ~1 ~ minecraft:lime_wool

function tdcdata-test:scoreboard/operation/after_each