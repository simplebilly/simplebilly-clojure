(ns simple-billy-api.specs.ai-suggestion-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ai-suggestion-request-data
  {
   (ds/opt :instructions) string?
   (ds/opt :message_body) string?
   (ds/req :ticket_id) uuid?
   })

(def ai-suggestion-request-spec
  (ds/spec
    {:name ::ai-suggestion-request
     :spec ai-suggestion-request-data}))
