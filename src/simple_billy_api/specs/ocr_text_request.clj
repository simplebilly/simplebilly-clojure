(ns simple-billy-api.specs.ocr-text-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ocr-text-request-data
  {
   (ds/opt :ocrText) string?
   })

(def ocr-text-request-spec
  (ds/spec
    {:name ::ocr-text-request
     :spec ocr-text-request-data}))
