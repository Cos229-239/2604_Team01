# CODEX

This file captures the working product rules, layout standards, and behavior expectations for SupaTewl V2.

## Global UI Rules

- Use the `Roster` top toolbar as the size/layout standard across tools.
- Standard top toolbar layout should fit into:
  - `4` single-width cards
  - `1` double-width card when needed
- Do not invent oversized custom toolbar layouts per page.
- Bottom output bar stays fixed at the bottom of the viewport.
- Left nav version stays in the lower-right of the left toolbar.
- Scope pills belong at the bottom of each tool box.

## Roster Rules

- `Save Changes` writes the active cycle roster file.
- Saving should not collapse the entire page or reset open cards.
- Team-level Discord IDs belong on the team record, not the student record.
- Team-level Discord fields:
  - `Standup`
  - `General`
  - `Setup`
  - `Discord Welcome ID`
  - `Additional 1..4`
- Default `Discord Welcome ID`:
  - `1377486981981933698`

## Student Card Rules

- Student field order:
  - `Name` / `Discord ID`
  - `GitHub email` / `GitHub ID`
  - `Trello email` / `Trello username`
  - `Trello display name` / `Trello member ID`
- Student actions:
  - `Delete`
  - `Verify`
  - `Save`
- Student `Save` should be red and match the main save style, just smaller.
- `Welcome message` is the primary raw intake block.
- `Student notes` remains as a separate raw notes block.
- `Welcome message` controls:
  - top-right: `Populate Above`
  - below-left: `Fetch Info`
- No extra button row under `Student notes`.

## Populate / Verify Behavior

- `Fetch Info`:
  - pulls the matching intro/welcome Discord post using:
    - team `Discord Welcome ID`
    - student `Discord ID` first
    - student `Name` as fallback
- `Populate Above`:
  - if `Welcome message` already has content, parse it directly
  - if empty, fetch first, then parse
- `Verify` should try to auto-fill empty fields using available data before just coloring them.
- `Verify` should use:
  - parsed welcome message
  - parsed student notes
  - GitHub verified account info
  - Trello board match info
- `Verify` should touch all Trello identity fields when possible:
  - `Trello email`
  - `Trello username`
  - `Trello display name`
  - `Trello member ID`

## Discord / Parsing Rules

- `#introduce-yourself` is a real source of roster data.
- Team standups may come from:
  - a thread
  - a channel
  - both
- Discord IDs should be stored as raw Discord IDs; they may point to channels or threads.
- Welcome/introduction parsing should handle multi-line patterns like:
  - `Discord:`
  - `Username: foo`
  - `GitHub:`
  - `Email: foo@bar.com`
  - `Username: foo`

## Reports Rules

- Reports phases:
  - `PNP2`
  - `PNP3`
- `PNP2` currently spans `Week 01–08`.
- `PNP3` currently spans `Week 05–08`.
- For `PNP2`, the lead page for early weeks should be the LMS-style page.
- Reports should favor shared normalized data feeding:
  - V1
  - V2
  - LMS
- Avoid wrapping old CLI output when a direct web/server step is possible.

## PNP2 Assignment Intent

- `1.1 Course Setup: Discord`
  - verify via intro/setup post in Discord
- `1.2 GitHub Desktop`
  - verify repo access, commit/push, branch/working state
  - cannot prove GitHub Desktop specifically
- `2.1 Agile Board Access & Orientation`
  - verify on board + at least one self-assigned card
- `2.2 Clone Your Project Repository`
  - verify repo access + commit/push + branch/working state
- `3.1 Daily Standups`
  - any standup post this week counts
- `3.2 Weekly Git Activity`
  - softer threshold; ramp toward PNP3 expectations
- `4.1` / `4.2`
  - stricter than week 3, still part of the onramp

## Flag Rules

- Participation is not its own scored category.
- Missing/extra users are flags only.
- One-member dominance is noted, not scored.
- Preferred wording:
  - `inactive`

## Identity Exclusions

- Teacher/staff identities should be excluded globally.
- Known examples:
  - `FullSailPatrick`
  - `patrickjkelly`
  - `Patrick J Kelly`
  - `CameronRoteringFS`
  - `cameronrotering`
  - `Cameron Rotering`

## Working Principle

- Use the page shell/layout from the established standard page.
- Fit the tool to the layout, not the other way around.
- Prefer direct web/server logic over piping opaque CLI wrappers into the UI.
