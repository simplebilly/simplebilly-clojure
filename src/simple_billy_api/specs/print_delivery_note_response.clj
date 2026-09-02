(ns simple-billy-api.specs.print-delivery-note-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def print-delivery-note-response-data
  {
   (ds/req :message) string?
   (ds/opt :pdf_url) string?
   (ds/req :success) boolean?
   })

(def print-delivery-note-response-spec
  (ds/spec
    {:name ::print-delivery-note-response
     :spec print-delivery-note-response-data}))
