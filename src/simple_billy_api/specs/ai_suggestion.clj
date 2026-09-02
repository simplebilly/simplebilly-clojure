(ns simple-billy-api.specs.ai-suggestion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ai-suggestion-data
  {
   (ds/req :confidence) float?
   (ds/req :reasoning) string?
   (ds/opt :suggested_priority) string?
   (ds/req :suggested_reply) string?
   (ds/opt :suggested_status) string?
   (ds/req :tool_calls) (s/coll-of string?)
   })

(def ai-suggestion-spec
  (ds/spec
    {:name ::ai-suggestion
     :spec ai-suggestion-data}))
