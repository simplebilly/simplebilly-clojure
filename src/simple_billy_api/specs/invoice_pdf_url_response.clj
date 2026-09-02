(ns simple-billy-api.specs.invoice-pdf-url-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invoice-pdf-url-response-data
  {
   (ds/req :url) string?
   })

(def invoice-pdf-url-response-spec
  (ds/spec
    {:name ::invoice-pdf-url-response
     :spec invoice-pdf-url-response-data}))
