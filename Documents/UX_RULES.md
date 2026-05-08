# SupaV2 UX Rules

## Repo Pills

1. Where possible, use one repo pill per repo.
2. If a page contains multiple tools, one repo pill per repo per tool is acceptable.
3. Avoid duplicate repo pills in the same tool when a link or secondary action can live inside the main repo pill.

## Status Colors

1. Green = good
2. Blue = pending / possible
3. Pink = not done
4. Red = bad
5. Gold is reserved for fully ready / on repo states only.

## Tool Buttons

1. Where possible, each tool should have two primary actions:
   - Verify
   - Execute
2. Verify checks state.
3. Execute performs the action.

## Tool Status

1. Each tool should show status pills at the bottom.
2. These pills should say what is live, what is planned, and what is not available yet.
3. Prefer green for live and red/pink for missing or not done.

## Layout Consistency

1. Reuse the same visual structure across tools when the same kind of data is shown.
2. If one tool uses repo checkboxes, verify buttons, and execute buttons, similar tools should follow that pattern.
3. SupaV2 pages should use a consistent shell where possible:
   - left nav
   - sticky top toolbar
   - sticky bottom output bar
4. The output/log area should live in the sticky bottom bar so it has enough room for messages.
