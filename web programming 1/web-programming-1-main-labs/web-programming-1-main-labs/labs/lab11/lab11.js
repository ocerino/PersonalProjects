 export class Lab11{

    testDefaultParameters(first, second=100)
    {
        console.log(arguments);
        return {
            first: first,
            second: second
        };
    }

    testTemplateLiterals(firstName, middleName, lastName)
    {
        return `Hi my name is ${firstName}, ${middleName}, ${lastName}`;
    }

    testMultilineStrings()
    {
        return `This is a multiline string.
        WOW!
        Sugoi!
        So awesome!`;
    }

    testSortWithArrowFunction(args)
    {
        return args.sort((a, b) => parseFloat(b)-parseFloat(a));
    }

}


