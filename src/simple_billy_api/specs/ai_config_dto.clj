(ns simple-billy-api.specs.ai-config-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ai-config-dto-data
  {
   (ds/opt :auto_reply) boolean?
   (ds/opt :max_tool_calls) int?
   (ds/req :model) string?
   (ds/req :name) string?
   (ds/req :provider) string?
   (ds/opt :system_prompt) string?
   (ds/opt :trigger_on) (s/coll-of string?)
   })

(def ai-config-dto-spec
  (ds/spec
    {:name ::ai-config-dto
     :spec ai-config-dto-data}))
