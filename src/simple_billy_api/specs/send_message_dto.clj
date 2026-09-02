(ns simple-billy-api.specs.send-message-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def send-message-dto-data
  {
   (ds/req :body) string?
   (ds/opt :is_internal) boolean?
   })

(def send-message-dto-spec
  (ds/spec
    {:name ::send-message-dto
     :spec send-message-dto-data}))
