(ns simple-billy-api.specs.qr-code-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def qr-code-response-data
  {
   (ds/req :content_type) string?
   (ds/req :qr_code_base64) string?
   })

(def qr-code-response-spec
  (ds/spec
    {:name ::qr-code-response
     :spec qr-code-response-data}))
